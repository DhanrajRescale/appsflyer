package l5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f implements v5.q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24022a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // v5.q
    public final Object i(Uri uri, g5.g gVar) {
        long j10;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(gVar, kp.e.f23433c)).readLine();
        try {
            Matcher matcher = f24022a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j10 = 1;
                    } else {
                        j10 = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= (((parseLong2 * 60) + parseLong) * 60000) * j10;
                }
                return Long.valueOf(time);
            }
            throw ParserException.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e10) {
            throw ParserException.b(null, e10);
        }
    }
}
