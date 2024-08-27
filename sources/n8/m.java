package n8;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class m extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y8.j f28390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f28391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z8.g f28392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f28393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap f28394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y8.j jVar, o oVar, z8.g gVar, e eVar, Bitmap bitmap, yt.a aVar) {
        super(2, aVar);
        this.f28390b = jVar;
        this.f28391c = oVar;
        this.f28392d = gVar;
        this.f28393e = eVar;
        this.f28394f = bitmap;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new m(this.f28390b, this.f28391c, this.f28392d, this.f28393e, this.f28394f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28389a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            y8.j jVar = this.f28390b;
            ArrayList arrayList = this.f28391c.f28402g;
            z8.g gVar = this.f28392d;
            e eVar = this.f28393e;
            if (this.f28394f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            t8.l lVar = new t8.l(jVar, arrayList, 0, jVar, gVar, eVar, z10);
            this.f28389a = 1;
            obj = lVar.b(jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
