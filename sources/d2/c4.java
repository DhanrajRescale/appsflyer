package d2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public su.b f13390a;

    /* renamed from: b, reason: collision with root package name */
    public int f13391b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f13393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f13394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d4 f13395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su.g f13396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f13397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(ContentResolver contentResolver, Uri uri, d4 d4Var, su.g gVar, Context context, yt.a aVar) {
        super(2, aVar);
        this.f13393d = contentResolver;
        this.f13394e = uri;
        this.f13395f = d4Var;
        this.f13396g = gVar;
        this.f13397h = context;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c4 c4Var = new c4(this.f13393d, this.f13394e, this.f13395f, this.f13396g, this.f13397h, aVar);
        c4Var.f13392c = obj;
        return c4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c4) create((tu.g) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:11:0x0047, B:16:0x0057, B:18:0x005f), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0082 -> B:10:0x0047). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f13391b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            su.b r1 = r9.f13390a
            java.lang.Object r4 = r9.f13392c
            tu.g r4 = (tu.g) r4
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L17
            r10 = r4
            goto L46
        L17:
            r10 = move-exception
            r4 = r9
            goto L90
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            su.b r1 = r9.f13390a
            java.lang.Object r4 = r9.f13392c
            tu.g r4 = (tu.g) r4
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L17
            r5 = r4
            r4 = r9
            goto L57
        L2f:
            ut.n.b(r10)
            java.lang.Object r10 = r9.f13392c
            tu.g r10 = (tu.g) r10
            android.content.ContentResolver r1 = r9.f13393d
            android.net.Uri r4 = r9.f13394e
            r5 = 0
            d2.d4 r6 = r9.f13395f
            r1.registerContentObserver(r4, r5, r6)
            su.g r1 = r9.f13396g     // Catch: java.lang.Throwable -> L17
            su.b r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L46:
            r4 = r9
        L47:
            r4.f13392c = r10     // Catch: java.lang.Throwable -> L84
            r4.f13390a = r1     // Catch: java.lang.Throwable -> L84
            r4.f13391b = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = r1.b(r4)     // Catch: java.lang.Throwable -> L84
            if (r5 != r0) goto L54
            return r0
        L54:
            r8 = r5
            r5 = r10
            r10 = r8
        L57:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L84
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L86
            r1.c()     // Catch: java.lang.Throwable -> L84
            android.content.Context r10 = r4.f13397h     // Catch: java.lang.Throwable -> L84
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L84
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L84
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L84
            r4.f13392c = r5     // Catch: java.lang.Throwable -> L84
            r4.f13390a = r1     // Catch: java.lang.Throwable -> L84
            r4.f13391b = r2     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r5.a(r6, r4)     // Catch: java.lang.Throwable -> L84
            if (r10 != r0) goto L82
            return r0
        L82:
            r10 = r5
            goto L47
        L84:
            r10 = move-exception
            goto L90
        L86:
            android.content.ContentResolver r10 = r4.f13393d
            d2.d4 r0 = r4.f13395f
            r10.unregisterContentObserver(r0)
            kotlin.Unit r10 = kotlin.Unit.f23355a
            return r10
        L90:
            android.content.ContentResolver r0 = r4.f13393d
            d2.d4 r1 = r4.f13395f
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.c4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
