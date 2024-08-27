package lj;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends PasswordTransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24869a = new PasswordTransformationMethod();

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence source, View view) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(view, "view");
        CharSequence transformation = super.getTransformation(source, view);
        Intrinsics.checkNotNullExpressionValue(transformation, "getTransformation(...)");
        return new a(transformation);
    }
}
