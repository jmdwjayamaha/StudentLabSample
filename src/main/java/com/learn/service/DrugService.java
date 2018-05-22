package com.learn.service;

import java.util.List;

import com.learn.model.Drug;

/**
 * The Interface DrugService.
 * 
 * @author VJAYAD1
 */
public interface DrugService {

    /**
     * Creates the drug.
     *
     * @param drug
     *            the drug
     * @return the drug
     */
    Drug createDrug(Drug drug);

    /**
     * List drugs.
     *
     * @param category
     *            the category
     * @return the list
     */
    List<Drug> listDrugs(String category);

    /**
     * Udpate drug.
     *
     * @param id
     *            the id
     * @param drug
     *            the drug
     * @return the drug
     */
    Drug udpateDrug(String id, Drug drug);

    /**
     * Retrieve drug.
     *
     * @param id
     *            the id
     * @return the drug
     */
    Drug retrieveDrug(String id);

    /**
     * Delete drug.
     *
     * @param id
     *            the id
     */
    void deleteDrug(String id);
}
