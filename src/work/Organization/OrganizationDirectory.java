/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work.Organization;

import java.util.ArrayList;

/**
 *
 * @author jatin
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Salon.getValue())) {
            organization = new SalonOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Spa.getValue())) {
            organization = new SpaOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Meditation.getValue())) {
            organization = new MeditationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Counsellor.getValue())) {
            organization = new CounsellorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Medicare.getValue())) {
            organization = new MedicareOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Nutritionist.getValue())) {
            organization = new NutritionistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Fitness.getValue())) {
            organization = new FitnessOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Yoga.getValue())) {
            organization = new YogaOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
