package com.learn.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.model.Drug;
import com.learn.repository.DrugRepository;
import com.learn.service.DrugService;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugRepository drugRepository;

    @Override
    public Drug createDrug(final Drug drug) {

        drug.setId(UUID.randomUUID().toString());

        return drugRepository.save(drug);
    }

    @Override
    public List<Drug> listDrugs(final String category) {

        return drugRepository.findByCategoryAndDeleted(category, false);
    }

    @Override
    public Drug udpateDrug(final String id, final Drug drug) {

        return drugRepository.save(drug);
    }

    @Override
    public Drug retrieveDrug(final String id) {

        return drugRepository.findOne(id);
    }

    @Override
    public void deleteDrug(final String id) {

        final Drug extDrug = drugRepository.findOne(id);

        extDrug.setDeleted(true);
        drugRepository.save(extDrug);

    }
}
