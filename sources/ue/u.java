package ue;

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
public final class u extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f37136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Spannable f37137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f37141h;

    public u(boolean z10, TextView textView, Spannable spannable, int i10, int i11, int i12, Function1 function1, Context context) {
        this.f37135b = z10;
        this.f37136c = textView;
        this.f37137d = spannable;
        this.f37138e = i10;
        this.f37139f = i11;
        this.f37140g = i12;
        this.f37141h = function1;
        Intrinsics.c(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37134a = context;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(false);
        textPaint.setColor(r3.k.getColor(this.f37134a, R.color.blue_4A20E6));
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        if (this.f37135b) {
            yk.j.w1(this.f37136c, this.f37137d, this.f37138e, false, this.f37139f, this.f37140g, this.f37141h);
        } else {
            yk.j.w1(this.f37136c, this.f37137d, this.f37138e, true, this.f37139f, this.f37140g, this.f37141h);
        }
    }
}
