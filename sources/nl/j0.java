package nl;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum j0 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f28868b;

    /* renamed from: a, reason: collision with root package name */
    public final long f28872a;

    static {
        EnumSet allOf = EnumSet.allOf(j0.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        f28868b = allOf;
    }

    j0(long j10) {
        this.f28872a = j10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static j0[] valuesCustom() {
        return (j0[]) Arrays.copyOf(values(), 3);
    }
}
