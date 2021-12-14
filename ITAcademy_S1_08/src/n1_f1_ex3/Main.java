package n1_f1_ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> llista = Arrays.asList("Afganistan","Aland","Albània","Alemanya","Algèria","Andorra","Angola","Anguilla","Antàrtida","Antigua i Barbuda","Aràbia Saudí","Argentina","Armènia","Aruba","Austràlia","Àustria","Azerbaidjan","Bahames, les","Bahrain","Bangladesh","Barbados","Belarús","Bèlgica","Belize","Benín","Bermudes","Bhutan","Bolívia","Bonaire, Sint Eustatius i Saba","Bòsnia i Hercegovina","Botswana","Brasil","Brunei","Bulgària","Burkina Faso","Burundi","Cambodja","Camerun","Canadà","Cap Verd","Catalunya","Colòmbia","Comores, les","Congo","Corea del Nord","Corea del Sud","Costa d'Ivori","Costa Rica","Croàcia","Cuba","Curaçao","Dinamarca","Djibouti","Dominica","Egipte","El Salvador","Emirats Àrabs Units, els","Equador","Eritrea","Eslovàquia","Eslovènia","Espanya","Estats Units, els","Estònia","Eswatini","Etiòpia","Fèroe","Fiji","Filipines","Finlàndia","França","Gabon","Gàmbia","Geòrgia","Ghana","Gibraltar","Grècia","Grenada","Groenlàndia","Guadalupe","Guaiana Francesa","Guam","Guatemala","Guernsey","Guinea","Guinea Equatorial","Guinea-Bissau","Guyana","Haití","Hondures","Hong Kong, Xina","Hongria","Iemen, el","Illa Bouvet","Illa Christmas","Illa de Man","Illa Norfolk","Illes Caiman","Illes Cocos (Keeling)","Illes Cook","Illes Falkland (Malvines)","Illes Geòrgia del Sud i Sandwich del Sud","Illes Heard i McDonald","Illes Marianes del Nord","Illes Marshall","Illes Menors Allunyades dels Estats Units","Illes Salomó","Illes Turks i Caicos","Illes Verges Britàniques","Illes Verges dels Estats Units","Índia","Indonèsia","Iran","Iraq, l'","Irlanda","Islàndia","Israel","Itàlia","Jamaica","Japó","Jersey","Jordània","Kazakhstan","Kenya","Kirguizstan","Kiribati","Kuwait","Lao","Lesotho","Letònia","Líban","Libèria","Líbia","Liechtenstein","Lituània","Luxemburg","Macao, Xina","Macedònia del Nord","Madagascar","Malàisia","Malawi","Maldives","Mali","Malta","Marroc, el","Martinica","Maurici","Mauritània","Mayotte","Mèxic","Micronèsia","Moçambic","Moldàvia","Mònaco","Mongòlia","Montenegro","Montserrat","Myanmar","Namíbia","Nauru","Nepal","Nicaragua","Níger","Nigèria","Niue","Noruega","Nova Caledònia","Nova Zelanda","Oman","Països Baixos","Pakistan","Palau","Palestina","Panamà","Papua Nova Guinea","Paraguai","Perú","Pitcairn","Polinèsia Francesa","Polònia","Portugal","Puerto Rico","Qatar","Regne Unit","República Centreafricana","República Democràtica del Congo","República Dominicana","Reunió, la","Romania","Ruanda","Rússia","Sàhara Occidental","Saint Helena, Ascenció i Tristan da Cunha","Saint Kitts i Nevis","Saint Lucia","Saint Vincent i les Grenadines","Saint-Barthélemy","Saint-Martin","Saint-Pierre-et-Miquelon","Samoa","Samoa Americana","San Marino","Santa Seu","São Tomé i Príncipe","Senegal","Sèrbia","Seychelles","Sierra Leone","Singapur","Sint Maarten","Síria","Somàlia","Sri Lanka","Sud-àfrica","Sudan del Sud, el","Sudan, el","Suècia","Suïssa","Surinam","Svalbard i Jan Mayen","Tadjikistan","Tailàndia","Taiwan","Tanzània","Terres Australs i Antàrtiques Franceses","Territori Britànic de l'Oceà Índic","Timor-Leste","Togo","Tokelau","Tonga","Trinidad i Tobago","Tunísia","Turkmenistan","Turquia","Tuvalu","Txad","Txèquia","Ucraïna","Uganda","Uruguai","Uzbekistan","Vanuatu","Veneçuela","Vietnam","Wallis i Futuna","Xile","Xina","Xipre","Zàmbia","Zimbàbue");
		
		List<Pais> paisos = new ArrayList<>();
		llista.forEach(p -> paisos.add(new Pais(p)));
		
		mostraPaisos(paisos, p -> p.conte('o'));
		
		
	}

	
	public static void mostraPaisos(List<Pais> paisos, Filtrable tester) {
		for (Pais p : paisos) {
	        if (tester.filtra(p)) {
	            p.mostraPais();
	        }
	    }
	}
	

}
