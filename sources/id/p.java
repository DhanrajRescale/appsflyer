package id;

import com.assetgro.stockgro.data.enums.GroupJoinStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19875a;

    static {
        int[] iArr = new int[GroupJoinStatus.values().length];
        try {
            iArr[GroupJoinStatus.Joined.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GroupJoinStatus.Requested.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GroupJoinStatus.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GroupJoinStatus.Exited.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f19875a = iArr;
    }
}
