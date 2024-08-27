package d4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class x2 extends w2 {
    public x2(@NonNull d3 d3Var, @NonNull WindowInsets windowInsets) {
        super(d3Var, windowInsets);
    }

    @Override // d4.b3
    @NonNull
    public d3 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f13855c.consumeDisplayCutout();
        return d3.g(null, consumeDisplayCutout);
    }

    @Override // d4.b3
    public m e() {
        DisplayCutout displayCutout;
        displayCutout = this.f13855c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new m(displayCutout);
    }

    @Override // d4.v2, d4.b3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        if (Objects.equals(this.f13855c, x2Var.f13855c) && Objects.equals(this.f13859g, x2Var.f13859g)) {
            return true;
        }
        return false;
    }

    @Override // d4.b3
    public int hashCode() {
        return this.f13855c.hashCode();
    }
}
