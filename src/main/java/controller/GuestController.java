package controller;

import model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.GuestService;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping("/event/{eventId}")
    public List<Guest> getGuestsByEvent(@PathVariable Long eventId) {
        return guestService.getGuestsByEvent(eventId);
    }

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }

    @DeleteMapping("/{id}")
    public void deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
    }
}
