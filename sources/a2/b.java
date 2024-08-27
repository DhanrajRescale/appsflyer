package a2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends iu.h implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f34i = new b();

    public b() {
        super(2, ku.a.class, "min", "min(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
