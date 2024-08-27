package ej;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd.h f15518b;

    public /* synthetic */ o(gd.h hVar, int i10) {
        this.f15517a = i10;
        this.f15518b = hVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        int i11 = this.f15517a;
        gd.h hVar = this.f15518b;
        switch (i11) {
            case 0:
                p this$0 = (p) hVar;
                int i12 = p.f15521j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i10 != 4 || keyEvent.getAction() != 1 || this$0.f15522i) {
                    return false;
                }
                this$0.requireActivity().finish();
                return true;
            default:
                t0 this$02 = (t0) hVar;
                int i13 = t0.f15547i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (i10 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                this$02.requireActivity().finish();
                return true;
        }
    }
}
