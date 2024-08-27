package sj;

import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.mentionable_edit_text.CustomEditText;
import com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText;
import java.util.ArrayList;
import k7.y1;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g extends y1 implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f34664u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f34665v;

    /* renamed from: w, reason: collision with root package name */
    public final f f34666w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f34667x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, View view, f fVar) {
        super(view);
        this.f34667x = hVar;
        this.f34664u = (TextView) view.findViewById(R.id.tvSuggestionWord);
        this.f34665v = (ImageView) view.findViewById(R.id.imgAvatar);
        this.f34666w = fVar;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f fVar = this.f34666w;
        if (fVar != null) {
            d dVar = (d) this.f34667x.f34668d.get(e());
            MentionableEditText mentionableEditText = (MentionableEditText) fVar;
            String obj = mentionableEditText.f10754c.getText().toString();
            ke.a aVar = mentionableEditText.f10758g;
            if (aVar != null) {
                aVar.i(dVar);
            }
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            for (int length = (r2.f10746g - 1) - mentionableEditText.f10754c.getCurrentWord().length(); length >= 0; length--) {
                StringBuilder p10 = da.e.p(str2);
                p10.append(obj.charAt(length));
                str2 = p10.toString();
            }
            int i10 = mentionableEditText.f10754c.f10746g;
            while (true) {
                i10++;
                if (i10 >= obj.length()) {
                    break;
                }
                StringBuilder p11 = da.e.p(str);
                p11.append(obj.charAt(i10));
                str = p11.toString();
            }
            String sb2 = new StringBuilder(dVar.f34661a).insert(0, '@').toString();
            String str3 = ((Object) new StringBuilder(str2).reverse()) + " " + sb2 + " " + str;
            mentionableEditText.f10754c.setText(str3, TextView.BufferType.SPANNABLE);
            SpannableString spannableString = new SpannableString(str3);
            int indexOf = str3.indexOf(sb2);
            int i11 = 0;
            while (i11 < str3.length() && indexOf != -1 && (indexOf = str3.indexOf(sb2, i11)) != -1) {
                spannableString.setSpan(new ClickableSpan(), indexOf, sb2.length() + indexOf, 33);
                spannableString.setSpan(new ForegroundColorSpan(-16776961), indexOf, sb2.length() + indexOf, 33);
                i11 = indexOf + 1;
            }
            SpannableString spannableString2 = new SpannableString(str3);
            int i12 = 0;
            while (true) {
                ArrayList arrayList = mentionableEditText.f10752a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                String str4 = "@" + ((String) arrayList.get(i12));
                int indexOf2 = str3.indexOf(str3);
                int i13 = 0;
                while (i13 < str3.length() && indexOf2 != -1 && (indexOf2 = str3.indexOf(str4, i13)) != -1) {
                    spannableString2.setSpan(new ClickableSpan(), indexOf2, str4.length() + indexOf2, 33);
                    spannableString2.setSpan(new ForegroundColorSpan(-16776961), indexOf2, str4.length() + indexOf2, 33);
                    i13 = indexOf2 + 1;
                }
                i12++;
            }
            mentionableEditText.f10754c.setText(spannableString2, TextView.BufferType.SPANNABLE);
            h hVar = mentionableEditText.f10755d;
            ArrayList arrayList2 = hVar.f34668d;
            if (arrayList2 != null) {
                arrayList2.clear();
                hVar.d();
            }
            CustomEditText customEditText = mentionableEditText.f10754c;
            customEditText.setSelection(customEditText.getText().length());
            if (mentionableEditText.f10759h != null) {
                h hVar2 = mentionableEditText.f10755d;
                ArrayList arrayList3 = hVar2.f34668d;
                if (arrayList3 != null) {
                    arrayList3.clear();
                    hVar2.d();
                }
                mentionableEditText.f10759h.dismiss();
                mentionableEditText.f10753b = false;
            }
        }
    }
}
