package yd;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import ba.n8;
import com.assetgro.stockgro.data.model.ExitOption;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.widget.ChipGroupView;
import com.google.android.material.chip.Chip;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41525d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3) {
        this.f41522a = i10;
        this.f41523b = obj;
        this.f41524c = obj2;
        this.f41525d = obj3;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        CheckBox checkBox;
        int i10 = this.f41522a;
        Object obj = this.f41525d;
        Object obj2 = this.f41524c;
        Object obj3 = this.f41523b;
        switch (i10) {
            case 0:
                ExitOption reason = (ExitOption) obj3;
                n8 option = (n8) obj2;
                e this$0 = (e) obj;
                c cVar = e.f41535b;
                Intrinsics.checkNotNullParameter(reason, "$reason");
                Intrinsics.checkNotNullParameter(option, "$option");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z10) {
                    String str = e.f41538e;
                    if (str != null && !Intrinsics.a(str, "nil") && (checkBox = (CheckBox) this$0.q().f4371t.findViewWithTag(e.f41538e)) != null) {
                        checkBox.setChecked(false);
                    }
                    e.f41537d = reason;
                    e.f41538e = reason.getCode();
                    option.f27491e.getId();
                    option.f5532v.setEnabled(Intrinsics.a(reason.getCode(), "OTHERS"));
                    return;
                }
                e.f41537d = null;
                e.f41538e = "nil";
                option.f5532v.setEnabled(false);
                return;
            default:
                ChipGroupView this$02 = (ChipGroupView) obj3;
                Chip chip = (Chip) obj2;
                Tags it = (Tags) obj;
                int i11 = ChipGroupView.f10601u;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(chip, "$chip");
                Intrinsics.checkNotNullParameter(it, "$it");
                if (z10 && this$02.checkedIds.size() == 2) {
                    chip.setChecked(false);
                    return;
                }
                String tagId = it.getTagId();
                if (z10) {
                    this$02.checkedIds.add(tagId);
                    return;
                } else {
                    this$02.checkedIds.remove(tagId);
                    return;
                }
        }
    }
}
