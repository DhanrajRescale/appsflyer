package he;

import com.assetgro.stockgro.data.enums.ChatStates;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18300a;

    static {
        int[] iArr = new int[ChatStates.values().length];
        try {
            iArr[ChatStates.TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatStates.FAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18300a = iArr;
    }
}
