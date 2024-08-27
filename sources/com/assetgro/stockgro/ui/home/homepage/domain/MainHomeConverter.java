package com.assetgro.stockgro.ui.home.homepage.domain;

import com.assetgro.stockgro.ui.home.homepage.data.HomepageHeadingDto;
import com.assetgro.stockgro.ui.home.homepage.data.MainHomeDto;
import com.assetgro.stockgro.ui.home.homepage.data.SectionHomeDto;
import com.assetgro.stockgro.ui.home.homepage.data.WidgetDataProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.z;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/ui/home/homepage/domain/MainHomeConverter;", HttpUrl.FRAGMENT_ENCODE_SET, "widgetDataProcessor", "Lcom/assetgro/stockgro/ui/home/homepage/data/WidgetDataProcessor;", "(Lcom/assetgro/stockgro/ui/home/homepage/data/WidgetDataProcessor;)V", "toDomainHome", "Lcom/assetgro/stockgro/ui/home/homepage/domain/MainHomeDomain;", "mainHomeDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/MainHomeDto;", "toDomainSection", "Lcom/assetgro/stockgro/ui/home/homepage/domain/SectionHomeDomain;", "sectionHomeDto", "Lcom/assetgro/stockgro/ui/home/homepage/data/SectionHomeDto;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainHomeConverter {
    public static final int $stable = 0;

    @NotNull
    private final WidgetDataProcessor widgetDataProcessor;

    public MainHomeConverter(@NotNull WidgetDataProcessor widgetDataProcessor) {
        Intrinsics.checkNotNullParameter(widgetDataProcessor, "widgetDataProcessor");
        this.widgetDataProcessor = widgetDataProcessor;
    }

    private final SectionHomeDomain toDomainSection(SectionHomeDto sectionHomeDto) {
        WidgetDataInterface widgetDataInterface;
        String sectionId = sectionHomeDto.getSectionId();
        String widgetType = sectionHomeDto.getWidgetType();
        HomepageHeadingDto heading = sectionHomeDto.getHeading();
        Map<String, ? extends Object> widgetData = sectionHomeDto.getWidgetData();
        if (widgetData != null) {
            widgetDataInterface = this.widgetDataProcessor.processWidgetData(sectionHomeDto.getWidgetType(), widgetData);
        } else {
            widgetDataInterface = null;
        }
        return new SectionHomeDomain(sectionId, widgetType, heading, widgetDataInterface);
    }

    @NotNull
    public final MainHomeDomain toDomainHome(@NotNull MainHomeDto mainHomeDto) {
        Intrinsics.checkNotNullParameter(mainHomeDto, "mainHomeDto");
        List<SectionHomeDto> section = mainHomeDto.getSection();
        ArrayList arrayList = new ArrayList(z.k(section));
        Iterator<T> it = section.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomainSection((SectionHomeDto) it.next()));
        }
        return new MainHomeDomain(arrayList);
    }
}
