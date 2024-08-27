package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import g1.o;
import j0.m;
import j2.f0;
import kotlin.text.w;
import m1.d;
import p2.c0;

/* loaded from: classes.dex */
public abstract class a {
    public static final ExtractedText a(c0 c0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0Var.f30522a.f20699a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = c0Var.f30523b;
        extractedText.selectionStart = f0.e(j10);
        extractedText.selectionEnd = f0.d(j10);
        extractedText.flags = !w.t(c0Var.f30522a.f20699a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final boolean b(d dVar, float f10, float f11) {
        if (f10 <= dVar.f27241c && dVar.f27239a <= f10 && f11 <= dVar.f27242d && dVar.f27240b <= f11) {
            return true;
        }
        return false;
    }

    public static final o c(o oVar, m mVar) {
        return oVar.g(new LegacyAdaptingPlatformTextInputModifier(mVar));
    }
}
