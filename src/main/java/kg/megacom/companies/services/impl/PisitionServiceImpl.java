package kg.megacom.companies.services.impl;

import kg.megacom.companies.dao.PosiotionRepositories;
import kg.megacom.companies.entities.Position;
import kg.megacom.companies.services.PisitionService;

import java.util.List;

public class PisitionServiceImpl implements PisitionService {

   private PosiotionRepositories posiotionRepositories;


    @Override
    public Position savePosition(Position position) {
        position = posiotionRepositories.save(position);
        return position;
    }

    @Override
    public List<Position> getPositList() {
        return posiotionRepositories.findAll();
    }
}
