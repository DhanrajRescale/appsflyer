package hh;

import com.assetgro.stockgro.data.remote.response.ReportEntityType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18466a;

    static {
        int[] iArr = new int[ReportEntityType.values().length];
        try {
            iArr[ReportEntityType.User.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReportEntityType.Comment.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReportEntityType.Message.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReportEntityType.Post.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f18466a = iArr;
    }
}
