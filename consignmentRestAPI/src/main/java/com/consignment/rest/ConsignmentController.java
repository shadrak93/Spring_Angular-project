package com.consignment.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consignment.repo.ConsignmentEntity;
import com.consignment.repo.ConsignmentRepository;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
public class ConsignmentController {

	@Autowired
	ConsignmentRepository consignmentrepo;

	@GetMapping("/consignments")
	public List<ConsignmentEntity> getAllconsignment() {

		return (List<ConsignmentEntity>) consignmentrepo.findAll();
	}

	@PostMapping("/consign")
	public ConsignmentEntity saveConsignment(@RequestBody ConsignmentEntity consignment) {
		return consignmentrepo.save(consignment);
	}

	@PutMapping("/consignmet/{id}")
	public ConsignmentEntity updateconsignment(@PathVariable Integer id, @RequestBody ConsignmentEntity consign) {

		ConsignmentEntity existing = consignmentrepo.findById(id)
				.orElseThrow(() -> new RuntimeException("consignment both not found " + id));

		existing.setConsignmentstatus(consign.getConsignmentstatus() != null ? consign.getConsignmentstatus()
				: existing.getConsignmentstatus());
		existing.setConsignmencatogey(consign.getConsignmencatogey() != null ? consign.getConsignmencatogey()
				: existing.getConsignmencatogey());
		existing.setDeliverypartner(
				consign.getDeliverypartner() != null ? consign.getDeliverypartner() : existing.getDeliverypartner());

		consignmentrepo.save(existing);
		return existing;

	}

	@GetMapping("/consignmet/{id}")
	public ConsignmentEntity getConsignmentId(@PathVariable Integer id) {

		return consignmentrepo.findById(id).orElseThrow(() -> new RuntimeException("consignment both not found " + id));

	}

	@DeleteMapping("/consignmet/{id}")
	public String deleteconsignment(@PathVariable Integer id) {

		consignmentrepo.deleteById(id);

		return "Consignment Deleted" + id;
	}

}
