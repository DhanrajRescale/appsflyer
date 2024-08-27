package b0;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public interface z {
    static g1.o a(g1.o oVar) {
        if (1.0f > 0.0d) {
            return oVar.g(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
