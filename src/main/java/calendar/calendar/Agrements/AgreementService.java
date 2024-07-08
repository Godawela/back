package calendar.calendar.Agrements;


import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AgreementService {
    private final AgreementRepository agreementRepository;

    public AgreementService(AgreementRepository externalEventsRepository) {
        this.agreementRepository = externalEventsRepository;
    }

    public List<Agreement> getAllEvents() {
        return agreementRepository.findAll();
    }

}
