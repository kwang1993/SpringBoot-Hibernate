package tk.kaicheng.services;


import tk.kaicheng.models.Feature;
import tk.kaicheng.models.Profile;
import tk.kaicheng.models.User;

import java.util.List;

/**
 * Created by wangkaicheng on 2017/8/20.
 */
public interface FeatureService {

    Feature save(Feature feature);

    void deleteAll();

    void delete(Integer id);

    void delete(Feature feature);

    List <Feature> findAll();

    Feature findOne(Integer id);

    List <Feature> findByProfile(Profile profile);

    Feature findByFeatureNameAndProfile(String featureName, Profile profile);

    void updateFeatureName(Integer feature_id, String newFeatureName);

    List<Object[]> findEntryFeatureByFeatureId(Integer feature_id);
}
