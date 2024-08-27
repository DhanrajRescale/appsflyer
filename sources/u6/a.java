package u6;

import e5.p;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends s6.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f36852m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f36853n;

    public a(List list) {
        this.f36852m = 0;
        p pVar = new p((byte[]) list.get(0));
        this.f36853n = new h(pVar.z(), pVar.z());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // s6.a
    public final s6.b f(byte[] r49, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.a.f(byte[], int, boolean):s6.b");
    }

    public a() {
        this.f36852m = 1;
        this.f36853n = new p();
    }
}
