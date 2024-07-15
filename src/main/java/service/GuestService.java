package service;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.GuestRepository;

import java.util.List;
@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getGuestsByEvent(Long eventId) {
        return guestRepository.findByEventId(eventId);
    }

    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }
}
