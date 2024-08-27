package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.util.AttributeSet;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.t;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Lm/t;", HttpUrl.FRAGMENT_ENCODE_SET, "enabled", HttpUrl.FRAGMENT_ENCODE_SET, "setEnabled", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mt/p", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class DialogActionButton extends t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogActionButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setTextColor(0);
    }
}
