package kg.megacom.companies.services;

import kg.megacom.companies.entities.Position;

import java.util.List;

public interface PisitionService {
    Position savePosition(Position position);
    List<Position> getPositList();
}
