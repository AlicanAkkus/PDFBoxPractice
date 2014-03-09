import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class PdfTest {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		try {
			// Create a new empty Document
			// Bos bir document nesnesi olusturuyoruz
			final PDDocument document = new PDDocument();

			// Create a new blank page and add it to the document
			// Iki bos sayfa olusturup document'e ekliyoruz
			final PDPage page1 = new PDPage();
			final PDPage page2 = new PDPage();

			document.addPage(page1);
			document.addPage(page2);

			try {
				// Save the newly created document
				// dosyamizi "Deneme.pdf" adi ile kaydediyoruz.
				document.save("Deneme.pdf");
			} catch (final COSVisitorException e) {
				// TODO Auto-generated catch block
				System.out.println("Kaydetme Hatasý : " + e.getMessage());
			} finally {
				// Dosyamýzý kapatmamýz lazým
				document.close();
			}

		} catch (final IOException e) {
			System.out.println("Hata mesajý : " + e.getMessage());
		}
	}
}
