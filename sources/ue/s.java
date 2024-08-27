package ue;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements nk.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f37126b;

    public /* synthetic */ s(ProgressBar progressBar, int i10) {
        this.f37125a = i10;
        this.f37126b = progressBar;
    }

    @Override // nk.d
    public final void a(Object obj) {
        int i10 = this.f37125a;
        ProgressBar progressBar = this.f37126b;
        switch (i10) {
            case 0:
                progressBar.setVisibility(8);
                return;
            default:
                progressBar.setVisibility(8);
                return;
        }
    }

    @Override // nk.d
    public final void b(Object model) {
        int i10 = this.f37125a;
        ProgressBar progressBar = this.f37126b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                progressBar.setVisibility(8);
                return;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                progressBar.setVisibility(8);
                return;
        }
    }
}
