package com.tcrush.dao;

import com.tcrush.entity.dismissal.Dismissal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DismissalDao {
    void insertDismissal(Dismissal dismissal);
    List<Dismissal> selectDismissal(String number);
}
