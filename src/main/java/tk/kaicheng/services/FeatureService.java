package tk.kaicheng.services;


import tk.kaicheng.models.Feature;

/**
 * Created by wangkaicheng on 2017/8/20.
 */
public interface FeatureService {
    Feature save(Feature feature);

    void deleteAll();

    void delete(Integer id);

    void delete(Feature feature);

    Iterable <Feature> findAll();

    Feature findOne(Integer id);
}
