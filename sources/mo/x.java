package mo;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f27962a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f27963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27964c;

    /* renamed from: d, reason: collision with root package name */
    public int f27965d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27972k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f27966e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f27967f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f27968g = s0.g.f34069a;

    /* renamed from: h, reason: collision with root package name */
    public float f27969h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f27970i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27971j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f27973l = null;

    public x(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f27962a = charSequence;
        this.f27963b = textPaint;
        this.f27964c = i10;
        this.f27965d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f27962a == null) {
            this.f27962a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(0, this.f27964c);
        CharSequence charSequence = this.f27962a;
        int i10 = this.f27967f;
        TextPaint textPaint = this.f27963b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f27973l);
        }
        int min = Math.min(charSequence.length(), this.f27965d);
        this.f27965d = min;
        if (this.f27972k && this.f27967f == 1) {
            this.f27966e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f27966e);
        obtain.setIncludePad(this.f27971j);
        if (this.f27972k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f27973l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f27967f);
        float f10 = this.f27968g;
        if (f10 != s0.g.f34069a || this.f27969h != 1.0f) {
            obtain.setLineSpacing(f10, this.f27969h);
        }
        if (this.f27967f > 1) {
            obtain.setHyphenationFrequency(this.f27970i);
        }
        return obtain.build();
    }
}
