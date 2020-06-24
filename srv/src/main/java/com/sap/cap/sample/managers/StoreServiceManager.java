package com.sap.cap.sample.managers;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.sap.cds.Result;
import com.sap.cds.ql.Select;
import com.sap.cds.services.persistence.PersistenceService;

import cds.gen.bp.store.Authors;
import cds.gen.bp.store.Store_;

@Component
public class StoreServiceManager {

	private PersistenceService db;

	public StoreServiceManager(PersistenceService db) {
		this.db = db;
	}

	public Authors readAuthorByName(String name) {

		Result result = db//
				.run(Select//
						.from(Store_.AUTHORS)//
						.columns(b -> b.ID(), b -> b.name())// b._all()
						.where(b -> b.name().eq(name)));

		Optional<Authors> author = result.first(Authors.class);

		return author.get();
	}

}
