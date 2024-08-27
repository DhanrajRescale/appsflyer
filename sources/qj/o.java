package qj;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f32049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Spannable f32050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f32052f;

    public o(boolean z10, TextView textView, Spannable spannable, int i10, Function1 function1, Context context) {
        this.f32048b = z10;
        this.f32049c = textView;
        this.f32050d = spannable;
        this.f32051e = i10;
        this.f32052f = function1;
        Intrinsics.c(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32047a = context;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(false);
        textPaint.setColor(r3.k.getColor(this.f32047a, R.color.blue_4A20E6));
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        boolean z10 = this.f32048b;
        Function1 function1 = this.f32052f;
        int i10 = this.f32051e;
        Spannable spannable = this.f32050d;
        TextView textView = this.f32049c;
        if (z10) {
            el.l.L0(textView, spannable, i10, false, function1);
        } else {
            el.l.L0(textView, spannable, i10, true, function1);
        }
    }
}
