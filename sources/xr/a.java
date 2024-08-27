package xr;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.linkedin.android.spyglass.ui.MentionsEditText;
import w.k;

/* loaded from: classes2.dex */
public final class a extends ClickableSpan implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new zq.c(5);

    /* renamed from: a, reason: collision with root package name */
    public b f40546a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40547b;

    /* renamed from: c, reason: collision with root package name */
    public int f40548c;

    public a(Parcel parcel) {
        this.f40547b = false;
        this.f40548c = 1;
        this.f40546a = new b(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        this.f40548c = k.g(3)[parcel.readInt()];
        this.f40547b = parcel.readInt() == 1;
        com.google.android.gms.internal.p002firebaseauthapi.a.q(parcel.readParcelable(c.class.getClassLoader()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        MentionsEditText mentionsEditText;
        Editable text;
        if (!(view instanceof MentionsEditText) || (text = (mentionsEditText = (MentionsEditText) view).getText()) == null) {
            return;
        }
        mentionsEditText.setSelection(text.getSpanEnd(this));
        if (!this.f40547b) {
            mentionsEditText.b();
        }
        this.f40547b = !this.f40547b;
        mentionsEditText.c(this);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10 = this.f40547b;
        b bVar = this.f40546a;
        if (z10) {
            textPaint.setColor(bVar.f40551c);
            textPaint.bgColor = bVar.f40552d;
        } else {
            textPaint.setColor(bVar.f40549a);
            textPaint.bgColor = bVar.f40550b;
        }
        textPaint.setUnderlineText(false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = this.f40546a;
        parcel.writeInt(bVar.f40549a);
        parcel.writeInt(bVar.f40550b);
        parcel.writeInt(bVar.f40551c);
        parcel.writeInt(bVar.f40552d);
        parcel.writeInt(k.e(this.f40548c));
        parcel.writeInt(this.f40547b ? 1 : 0);
        parcel.writeParcelable(null, i10);
    }
}
