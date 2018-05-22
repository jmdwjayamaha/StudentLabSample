package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Drug;
import com.learn.service.DrugService;

/**
 * The Class DrugController.
 */
@RestController
@RequestMapping("/drugs")
public class DrugController {

    /** The drug service. */
    @Autowired
    private DrugService drugService;

    /**
     * Creates the drug.
     *
     * @param drug
     *            the drug
     * @return the drug
     */
    @RequestMapping(method = RequestMethod.POST)
    public Drug createDrug(@Validated @RequestBody final Drug drug) {

        return drugService.createDrug(drug);
    }

    /**
     * List drugs.
     *
     * @param category
     *            the category
     * @return the list
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Drug> listDrugs(@RequestParam(value = "category", required = false) final String category) {

        return drugService.listDrugs(category);
    }

    /**
     * Update drug.
     *
     * @param id
     *            the id
     * @param drug
     *            the drug
     * @return the drug
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Drug updateDrug(@PathVariable("id") final String id, @Validated @RequestBody final Drug drug) {

        return drugService.udpateDrug(id, drug);
    }

    /**
     * Gets the drug.
     *
     * @param id
     *            the id
     * @return the drug
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Drug getDrug(@PathVariable("id") final String id) {

        return drugService.retrieveDrug(id);
    }

    /**
     * Delete drug.
     *
     * @param id
     *            the id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteDrug(@PathVariable("id") final String id) {

        drugService.deleteDrug(id);
    }
}
