package ue;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends TypefaceSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f37143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(TextView textView, int i10) {
        super((String) null);
        this.f37142a = i10;
        this.f37143b = textView;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        int i10 = this.f37142a;
        TextView textView = this.f37143b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(ds2, "ds");
                ds2.setTypeface(Typeface.create(t3.p.a(R.font.inter_600, textView.getContext()), 0));
                return;
            default:
                Intrinsics.checkNotNullParameter(ds2, "ds");
                ds2.setTypeface(Typeface.create(t3.p.a(R.font.inter_600, textView.getContext()), 0));
                return;
        }
    }
}
