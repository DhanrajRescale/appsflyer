package vo;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.slider.Slider;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e4.m;
import hl.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes2.dex */
public final class a extends l4.b {

    /* renamed from: q, reason: collision with root package name */
    public final c f38193q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f38194r;

    public a(Slider slider) {
        super(slider);
        this.f38194r = new Rect();
        this.f38193q = slider;
    }

    @Override // l4.b
    public final int n(float f10, float f11) {
        int i10 = 0;
        while (true) {
            c cVar = this.f38193q;
            if (i10 < cVar.getValues().size()) {
                Rect rect = this.f38194r;
                cVar.s(i10, rect);
                if (rect.contains((int) f10, (int) f11)) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    @Override // l4.b
    public final void o(ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f38193q.getValues().size(); i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    @Override // l4.b
    public final boolean s(int i10, int i11, Bundle bundle) {
        c cVar = this.f38193q;
        if (!cVar.isEnabled()) {
            return false;
        }
        if (i11 != 4096 && i11 != 8192) {
            if (i11 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !cVar.q(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            cVar.t();
            cVar.postInvalidate();
            p(i10);
            return true;
        }
        float f10 = cVar.f38211h0;
        if (f10 == g.f34069a) {
            f10 = 1.0f;
        }
        if ((cVar.J - cVar.I) / f10 > 20) {
            f10 *= Math.round(r1 / r5);
        }
        if (i11 == 8192) {
            f10 = -f10;
        }
        if (cVar.i()) {
            f10 = -f10;
        }
        if (!cVar.q(i10, f.E(cVar.getValues().get(i10).floatValue() + f10, cVar.getValueFrom(), cVar.getValueTo()))) {
            return false;
        }
        cVar.t();
        cVar.postInvalidate();
        p(i10);
        return true;
    }

    @Override // l4.b
    public final void u(int i10, m mVar) {
        String str;
        String str2;
        mVar.b(e4.f.f14987t);
        c cVar = this.f38193q;
        List<Float> values = cVar.getValues();
        float floatValue = values.get(i10).floatValue();
        float valueFrom = cVar.getValueFrom();
        float valueTo = cVar.getValueTo();
        if (cVar.isEnabled()) {
            if (floatValue > valueFrom) {
                mVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            if (floatValue < valueTo) {
                mVar.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = mVar.f14996a;
        accessibilityNodeInfo.setRangeInfo(obtain);
        mVar.j(SeekBar.class.getName());
        StringBuilder sb2 = new StringBuilder();
        if (cVar.getContentDescription() != null) {
            sb2.append(cVar.getContentDescription());
            sb2.append(",");
        }
        if (((int) floatValue) == floatValue) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, Float.valueOf(floatValue));
        String string = cVar.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i10 == cVar.getValues().size() - 1) {
                str2 = cVar.getContext().getString(R.string.material_slider_range_end);
            } else if (i10 == 0) {
                str2 = cVar.getContext().getString(R.string.material_slider_range_start);
            } else {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            string = str2;
        }
        sb2.append(String.format(Locale.US, "%s, %s", string, format));
        mVar.m(sb2.toString());
        Rect rect = this.f38194r;
        cVar.s(i10, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
