package h5;

import android.os.Process;
import android.os.StrictMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18009a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18010b;

    public h(z2.e eVar) {
        this.f18010b = eVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i10 = this.f18009a;
        Object obj = this.f18010b;
        switch (i10) {
            case 0:
                s6.a aVar = (s6.a) obj;
                aVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (aVar.g());
                return;
            case 1:
                Process.setThreadPriority(9);
                dk.a aVar2 = (dk.a) obj;
                if (aVar2.f14404c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    return;
                } catch (Throwable th2) {
                    aVar2.f14403b.l(th2);
                    return;
                }
            default:
                ((Function0) obj).mo2invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s6.a aVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f18010b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dk.a aVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f18010b = aVar;
    }
}
