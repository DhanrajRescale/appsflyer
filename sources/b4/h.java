package b4;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3173b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3175d;

    public h(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = g.h(textPaint).setBreakStrategy(i10);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3172a = textPaint;
        this.f3173b = textDirectionHeuristic;
        this.f3174c = i10;
        this.f3175d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3174c == hVar.f3174c && this.f3175d == hVar.f3175d) {
            TextPaint textPaint = this.f3172a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = hVar.f3172a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f3173b == hVar.f3173b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f3172a;
        return c4.c.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3173b, Integer.valueOf(this.f3174c), Integer.valueOf(this.f3175d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder(UrlTreeKt.componentParamPrefix);
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3172a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f3173b);
        sb2.append(", breakStrategy=" + this.f3174c);
        sb2.append(", hyphenationFrequency=" + this.f3175d);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    public h(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3172a = textPaint;
        textDirection = params.getTextDirection();
        this.f3173b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3174c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3175d = hyphenationFrequency;
    }
}
