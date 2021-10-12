package nl.hu.asd.team3.train.application;

import nl.hu.asd.team3.train.adapter.repository.TrainCompositionRepository;
import nl.hu.asd.team3.train.adapter.repository.RollingStockRepository;
import nl.hu.asd.team3.train.application.exceptions.IdNotFoundException;
import nl.hu.asd.team3.train.domain.RollingStock;
import nl.hu.asd.team3.train.domain.TrainComposition;
import nl.hu.asd.team3.train.adapter.service.dto.inputRollingStockDTO;
import org.springframework.stereotype.Service;

@Service
public class TrainCompositionService {

    private TrainCompositionRepository trainCompositionRepository;
    private RollingStockRepository rollingStockRepository;

    public TrainCompositionService(TrainCompositionRepository trainCompositionRepository, RollingStockRepository rollingStockRepository) {
        this.trainCompositionRepository = trainCompositionRepository;
        this.rollingStockRepository = rollingStockRepository;
    }

    public TrainComposition addRollingStockToTrainComposition(Long t, inputRollingStockDTO i){
        TrainComposition trainComp = trainCompositionRepository.findById(t).orElseThrow(() -> new IdNotFoundException("no trainComposition found with id: " + t));
        RollingStock rollingStock = trainComp.addRollingStockDTO(i.position, i.stockType);
        rollingStockRepository.save(rollingStock);
        trainCompositionRepository.save(trainComp);
        return trainComp;
    }

}