package ic;

import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.domain.model.MissionTimeLeftUrgency;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19841a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19842b;

    static {
        int[] iArr = new int[MissionStatus.values().length];
        try {
            iArr[MissionStatus.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MissionStatus.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MissionStatus.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MissionStatus.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f19841a = iArr;
        int[] iArr2 = new int[MissionTimeLeftUrgency.values().length];
        try {
            iArr2[MissionTimeLeftUrgency.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MissionTimeLeftUrgency.LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MissionTimeLeftUrgency.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MissionTimeLeftUrgency.HIGH.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f19842b = iArr2;
    }
}
