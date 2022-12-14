package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

                //***rapor almak için-->
                plugin = {"json:target/cucumber.json",
                        "html:target/default-html-reports",
                        "rerun:target/rerun.txt"},

                features = "src/test/resources/features",
                //*** Yapılacak işlerin adım adım yazıldığı - Scenario nun pathi

                glue = "com/krafttech/step_definitions",
                //*** Scenario satırlarına karşılık gelen steps-methodların pathi

                 //dryRun = true,    //*** sadece undefined scenario stepi görür diğerlerini görmez
                dryRun = false,    //*** defined olanı görür undefined olanı görmez


                //------------------------------------------------------------------------
                // tags = "@JhonNash" //***sadece belirtilen tag i (login.feature daki haliyle) calıştırır
                // tags = "@smoke" // tagın işaretli olduğu seçili senaryoları calıştırır
                // tags = "@login" // @login işareti features dan önce konursa
                                // login altındaki bütün senaryoları calıştırır
                // tags = "@Mike and @smoke" // AND: belirtilen tagleri birlikte içeren senaryolar çalışır
                // tags = "@Mike or @smoke" // OR: belirtilen taglerden birini içeren senaryolar çalışır
                // tags = "@Mike and @smoke or @QA" // belirtilen taglerden birini içeren senaryolar çalışır
                // tags = "@login and not @SDET" // NOT: belirtilen taglerden biri dahil/hariç senaryolar çalışır
                // tags = "@login"
                // tags = "@task"
                //-------------------------------------------------------------------------


                //tags = "@rerun"

                tags =  "@negativeLogin"



                )


public class CukesRunner {
}
