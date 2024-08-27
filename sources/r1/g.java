package r1;

import android.graphics.PathMeasure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f32913b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f32914c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(0);
        this.f32915a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f32915a) {
            case 0:
                return new n1.j(new PathMeasure());
            default:
                return Unit.f23355a;
        }
    }
}
