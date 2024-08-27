package a2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends iu.h implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f39i = new c();

    public c() {
        super(2, ku.a.class, "max", "max(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
