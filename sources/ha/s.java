package ha;

import android.content.DialogInterface;
import android.view.View;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionOrderPageBottomSheetFragment;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18110a;

    public /* synthetic */ s(int i10) {
        this.f18110a = i10;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f18110a) {
            case 0:
                int i10 = OptionOrderPageBottomSheetFragment.f8606j;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar = (ao.f) dialogInterface;
                View findViewById = fVar.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    fVar.i().C(kj.f.j(600));
                    findViewById.getParent().getParent().requestLayout();
                    return;
                }
                return;
            case 1:
                int i11 = ka.i.f22796j;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar2 = (ao.f) dialogInterface;
                View findViewById2 = fVar2.findViewById(R.id.design_bottom_sheet);
                if (findViewById2 != null) {
                    fVar2.i().C(kj.f.j(600));
                    findViewById2.getParent().getParent().requestLayout();
                    return;
                }
                return;
            case 2:
                int i12 = i0.f24733j;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar3 = (ao.f) dialogInterface;
                View findViewById3 = fVar3.findViewById(R.id.design_bottom_sheet);
                if (findViewById3 != null) {
                    fVar3.i().C(kj.f.j(800));
                    findViewById3.getParent().getParent().requestLayout();
                    return;
                }
                return;
            case 3:
                int i13 = vf.c.f38027j;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar4 = (ao.f) dialogInterface;
                View findViewById4 = fVar4.findViewById(R.id.design_bottom_sheet);
                if (findViewById4 != null) {
                    fVar4.i().C(findViewById4.getHeight());
                    findViewById4.getParent().getParent().requestLayout();
                    return;
                }
                return;
            case 4:
                int i14 = dg.c.f14335i;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar5 = (ao.f) dialogInterface;
                View findViewById5 = fVar5.findViewById(R.id.design_bottom_sheet);
                if (findViewById5 != null) {
                    fVar5.i().C(findViewById5.getHeight());
                    findViewById5.getParent().getParent().requestLayout();
                    return;
                }
                return;
            default:
                int i15 = ih.b.f19987i;
                Intrinsics.d(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ao.f fVar6 = (ao.f) dialogInterface;
                View findViewById6 = fVar6.findViewById(R.id.design_bottom_sheet);
                if (findViewById6 != null) {
                    fVar6.i().C(kj.f.j(600));
                    findViewById6.getParent().getParent().requestLayout();
                    return;
                }
                return;
        }
    }
}
