package kj;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23210a;

    /* renamed from: b, reason: collision with root package name */
    public long f23211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut.d f23213d;

    public /* synthetic */ b(long j10, iu.k kVar, int i10) {
        this.f23210a = i10;
        this.f23212c = j10;
        this.f23213d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        int i10 = this.f23210a;
        ut.d dVar = this.f23213d;
        long j10 = this.f23212c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(v10, "v");
                if (SystemClock.elapsedRealtime() - this.f23211b >= j10) {
                    ((Function0) dVar).mo2invoke();
                    this.f23211b = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(v10, "v");
                if (SystemClock.elapsedRealtime() - this.f23211b >= j10) {
                    this.f23211b = SystemClock.elapsedRealtime();
                    ((Function1) dVar).invoke(v10);
                    return;
                }
                return;
        }
    }
}
