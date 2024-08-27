package pp;

import android.content.Context;
import m.a4;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements mq.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31264c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f31262a = i10;
        this.f31263b = obj;
        this.f31264c = obj2;
    }

    @Override // mq.c
    public final Object get() {
        int i10 = this.f31262a;
        Object obj = this.f31263b;
        Object obj2 = this.f31264c;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                String f10 = gVar.f();
                return new qq.a((Context) obj2, f10);
            case 1:
                bq.g gVar2 = (bq.g) obj;
                bq.a aVar = (bq.a) obj2;
                gVar2.getClass();
                return aVar.f7243f.h(new a4(aVar, gVar2));
            default:
                return new kq.h((Context) obj2, (String) obj);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f31262a = 2;
        this.f31264c = context;
        this.f31263b = str;
    }
}
