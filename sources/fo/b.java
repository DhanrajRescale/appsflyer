package fo;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.chip.Chip;
import e4.m;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b extends l4.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f16180q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Chip chip, Chip chip2) {
        super(chip2);
        this.f16180q = chip;
    }

    @Override // l4.b
    public final int n(float f10, float f11) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.f11233x;
        Chip chip = this.f16180q;
        if (chip.d()) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f10, f11)) {
                return 1;
            }
        }
        return 0;
    }

    @Override // l4.b
    public final void o(ArrayList arrayList) {
        boolean z10 = false;
        arrayList.add(0);
        Rect rect = Chip.f11233x;
        Chip chip = this.f16180q;
        if (chip.d()) {
            d dVar = chip.f11236e;
            if (dVar != null && dVar.X) {
                z10 = true;
            }
            if (z10 && chip.f11239h != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // l4.b
    public final boolean s(int i10, int i11, Bundle bundle) {
        boolean z10 = false;
        if (i11 == 16) {
            Chip chip = this.f16180q;
            if (i10 == 0) {
                return chip.performClick();
            }
            if (i10 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f11239h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z10 = true;
                }
                if (chip.f11251t) {
                    chip.f11250s.x(1, 1);
                }
            }
        }
        return z10;
    }

    @Override // l4.b
    public final void t(m mVar) {
        Chip chip = this.f16180q;
        boolean e10 = chip.e();
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        accessibilityNodeInfo.setCheckable(e10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        mVar.j(chip.getAccessibilityClassName());
        mVar.s(chip.getText());
    }

    @Override // l4.b
    public final void u(int i10, m mVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i10 == 1) {
            Chip chip = this.f16180q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                mVar.m(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                mVar.m(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            mVar.b(e4.f.f14974g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        mVar.m(HttpUrl.FRAGMENT_ENCODE_SET);
        accessibilityNodeInfo.setBoundsInParent(Chip.f11233x);
    }

    @Override // l4.b
    public final void v(int i10, boolean z10) {
        if (i10 == 1) {
            Chip chip = this.f16180q;
            chip.f11245n = z10;
            chip.refreshDrawableState();
        }
    }
}
