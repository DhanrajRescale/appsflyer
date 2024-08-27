package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f26391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(int i10, String str, Function0 function0) {
        super(1);
        this.f26389a = i10;
        this.f26390b = str;
        this.f26391c = function0;
    }

    public final void a(h2.v vVar) {
        int i10 = this.f26389a;
        Function0 function0 = this.f26391c;
        String str = this.f26390b;
        switch (i10) {
            case 0:
                h2.t.e(vVar, str);
                h2.j jVar = (h2.j) vVar;
                jVar.h(h2.i.f17826b, new h2.a(null, new j2(function0, 0)));
                return;
            case 1:
                h2.t.e(vVar, str);
                h2.j jVar2 = (h2.j) vVar;
                jVar2.h(h2.i.f17826b, new h2.a(null, new j2(function0, 1)));
                return;
            default:
                h2.t.e(vVar, str);
                h2.j jVar3 = (h2.j) vVar;
                jVar3.h(h2.i.f17826b, new h2.a(null, new j2(function0, 2)));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f26389a) {
            case 0:
                a((h2.v) obj);
                return Unit.f23355a;
            case 1:
                a((h2.v) obj);
                return Unit.f23355a;
            default:
                a((h2.v) obj);
                return Unit.f23355a;
        }
    }
}
