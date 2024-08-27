package jc;

import com.assetgro.stockgro.missions.domain.model.MissionStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21298a;

    static {
        int[] iArr = new int[MissionStatus.values().length];
        try {
            iArr[MissionStatus.UNDER_REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MissionStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MissionStatus.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MissionStatus.NOT_STARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21298a = iArr;
    }
}
